package dev.store.app.api.core.review;

public record Review(int productId, int reviewId, String author, String subject, String content, String serviceAddress) {

  public Review {
    productId = 0;
    reviewId = 0;
    author = null;
    subject = null;
    content = null;
    serviceAddress = null;
  }
}
