import sys
import unittest
from pathlib import Path

sys.path.append(str(Path(__file__).resolve().parents[1] / "src"))

import operacoes_lista
from produto import Produto


class OperacoesListaTestCase(unittest.TestCase):
    def test_buscar_produtos_retorna_lista_global(self):
        produtos = operacoes_lista.buscar_produtos()

        self.assertIs(produtos, operacoes_lista.PRODUTOS)

    def test_buscar_produtos_mantem_itens_como_produto(self):
        produtos = operacoes_lista.buscar_produtos()

        for produto in produtos:
            self.assertIsInstance(produto, Produto)


if __name__ == "__main__":
    unittest.main()
