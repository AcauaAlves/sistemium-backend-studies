public class ValidadorProduto {
    public static String validarNome(String nomeDigitado) {
        String nomeTratado = nomeDigitado.trim();

        if (nomeTratado.isEmpty()) {
            throw new IllegalArgumentException("Digite um nome válido para o produto.");
        }

        return nomeTratado;
    }

    public static double validarPreco(String precoDigitado) {
        String precoTratado = precoDigitado.trim().replace(",", ".");

        if (precoTratado.isEmpty()) {
            throw new IllegalArgumentException("Digite um preço válido para o produto.");
        }

        double precoConvertido;

        try {
            precoConvertido = Double.parseDouble(precoTratado);
        } catch (NumberFormatException erro) {
            throw new IllegalArgumentException("O preço precisa ser um número válido.");
        }

        if (precoConvertido < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }

        return precoConvertido;
    }
}
