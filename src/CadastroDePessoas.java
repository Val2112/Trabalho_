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
        public List<Pessoa> listarPessoas() {
            return pessoas;
        }
        public void alterarPessoa(String cpf, Pessoa novaPessoa) {
            for (Pessoa pessoa : pessoas) {
                if (pessoa.getCpf().equals(cpf)) {
                    pessoa.setNome(novaPessoa.getNome());
                    pessoa.setIdade(novaPessoa.getIdade());
                    pessoa.setCpf(novaPessoa.getCpf());
                    return;
                }
            }
        }

    }
