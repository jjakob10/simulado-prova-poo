package simulado_q1.twitter;

import java.util.Set;
import java.util.HashSet;

public class User {
  private String Nome;
  
  private String twitterId;
  private Set<Tweet> tweets = new HashSet<>();

  public User(String nome, String twitterId) {
    Nome = nome;
    this.twitterId = twitterId;
  }

  public void addTweet(Tweet t) {
    tweets.add(t);
  }

  public Set<Tweet> getTweets() {
    return new HashSet<Tweet>(tweets);
  }

  public String getNome() {
    return Nome;
  }

  public String getTwitterId() {
    return twitterId;
  }

}
