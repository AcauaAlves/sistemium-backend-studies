import sys
import unittest
from pathlib import Path

sys.path.append(str(Path(__file__).resolve().parents[1] / "src"))

from produto import Produto


class ProdutoTestCase(unittest.TestCase):
    def test_produto_guarda_nome_e_preco(self):
        produto = Produto("Arroz", 12.5)

        self.assertEqual(produto.get_nome(), "Arroz")
        self.assertEqual(produto.get_preco(), 12.5)

    def test_produto_permite_atualizar_dados(self):
        produto = Produto("Arroz", 12.5)

        produto.set_nome("Feijao")
        produto.set_preco(19.9)

        self.assertEqual(produto.get_nome(), "Feijao")
        self.assertEqual(produto.get_preco(), 19.9)


if __name__ == "__main__":
    unittest.main()
