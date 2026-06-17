import sys
import unittest
from pathlib import Path

sys.path.append(str(Path(__file__).resolve().parents[1] / "src"))

from erros import EntradaInvalidaError
from produto import Produto
from validacao import validar_nome_produto, validar_preco_produto


class TestesBasicosNivel1(unittest.TestCase):
    def test_produto_guarda_dados(self):
        produto = Produto("Arroz", 12.5)

        self.assertEqual(produto.get_nome(), "Arroz")
        self.assertEqual(produto.get_preco(), 12.5)

    def test_validar_nome_remove_espacos(self):
        self.assertEqual(validar_nome_produto("  Caderno  "), "Caderno")

    def test_validar_nome_vazio_lanca_erro(self):
        with self.assertRaises(EntradaInvalidaError):
            validar_nome_produto("   ")

    def test_validar_preco_negativo_lanca_erro(self):
        with self.assertRaises(EntradaInvalidaError):
            validar_preco_produto("-1")


if __name__ == "__main__":
    unittest.main()
