public class PessoaJuridica extends Pessoa{
    public String cpf;
    public float CalcularImposto(float rendimento){
        if (rendimento <= 3000){
            float resultado = (rendimento / 100) * 3;
            return resultado;
        } else if (rendimento > 3000 && rendimento <= 6000){
            float resultado = (rendimento / 100) * 5;
            return resultado;
        } else if (rendimento > 6000 && rendimento <= 10000){
            float resultado = (rendimento / 100) * 7;
            return resultado;
        } else {
            float resultado = (rendimento / 100) * 9;
            return resultado;
        }
    }
}
