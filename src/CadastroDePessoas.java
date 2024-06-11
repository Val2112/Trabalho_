import java.util.ArrayList;
import java.util.List;

    public class CadastroDePessoas {
        private List<Pessoa> pessoas;

        public CadastroDePessoas() {
            this.pessoas = new ArrayList<>();
        }

        public void adicionarPessoa(Pessoa pessoa) {
            pessoas.add(pessoa);
        }
    }
