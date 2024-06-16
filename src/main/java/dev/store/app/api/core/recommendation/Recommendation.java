package dev.store.app.api.core.recommendation;

public record Recommendation(int productId, int recommendationId, String author, int rate, String content, String serviceAddress) {

  public Recommendation {
    productId = 0;
    recommendationId = 0;
    author = null;
    content = null;
    serviceAddress = null;
  }
}
