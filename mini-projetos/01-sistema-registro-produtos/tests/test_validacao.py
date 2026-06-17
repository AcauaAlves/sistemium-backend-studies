import sys
import unittest
from pathlib import Path

sys.path.append(str(Path(__file__).resolve().parents[1] / "src"))

from erros import EntradaInvalidaError
from validacao import validar_nome_produto, validar_preco_produto


class ValidacaoTestCase(unittest.TestCase):
    def test_validar_nome_produto_remove_espacos(self):
        self.assertEqual(validar_nome_produto("  Caderno  "), "Caderno")

    def test_validar_nome_produto_rejeita_vazio(self):
        with self.assertRaises(EntradaInvalidaError):
            validar_nome_produto("   ")

    def test_validar_preco_produto_aceita_virgula(self):
        self.assertEqual(validar_preco_produto("10,50"), 10.5)

    def test_validar_preco_produto_rejeita_negativo(self):
        with self.assertRaises(EntradaInvalidaError):
            validar_preco_produto("-1")


if __name__ == "__main__":
    unittest.main()
