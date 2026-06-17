class Produto:
    def __init__(self, nome: str, preco: float):
        self.nome = nome
        self.preco = preco

    def set_nome(self, nome: str):
        self.nome = nome

    def set_preco(self, preco: float):
        self.preco = preco

    def get_nome(self) -> str:
        return self.nome

    def get_preco(self) -> float:
        return self.preco
