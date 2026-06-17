class ProdutoErro(Exception):
    """Excecao base do sistema de registro de produtos."""


class EntradaInvalidaError(ProdutoErro):
    """Erro usado quando a entrada do usuario nao passa na validacao."""
