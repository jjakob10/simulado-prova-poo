package simulado_q1.twitter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class VerifiedUser extends User {

  private LocalDate verificationDate;

  public VerifiedUser(String nome, String twitterId) {
    super(nome, twitterId);
    this.verificationDate = LocalDate.now();
  }

  public VerifiedUser(String nome, String twitterId, LocalDate data) {
    super(nome, twitterId);
    this.verificationDate = data;

  }

  @Override
  public String getNome() {

    return super.getNome() + "(verificado desde " + verificationDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
        + ")";
  }

}
