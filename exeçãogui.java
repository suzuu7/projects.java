import javax.swing.JOptionPane;
import java.time.LocalDate;

public class exececaogui {

    public static void main(String[] args) {

        try {

            String nome =
                    JOptionPane.showInputDialog("Digite o nome:");

            if (nome == null || nome.trim().isEmpty()) {
                throw new Exception("Nome não informado.");
            }

            int idade = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite a idade:")
            );

            if (idade < 0) {
                throw new Exception("Idade inválida.");
            }

            LocalDate data = LocalDate.parse(
                    JOptionPane.showInputDialog(
                            "Data de nascimento (AAAA-MM-DD):")
            );

            if (data.isAfter(LocalDate.now())) {
                throw new Exception("A data não pode ser futura.");
            }

            JOptionPane.showMessageDialog(
                    null,
                    "Cadastro realizado!\n\n" +
                    "Nome: " + nome +
                    "\nIdade: " + idade +
                    "\nNascimento: " + data
            );

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Digite um número válido."
            );

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    null,
                    e.getMessage()
            );

        } finally {

            JOptionPane.showMessageDialog(
                    null,
                    "Programa encerrado."
            );
        }
    }
}
