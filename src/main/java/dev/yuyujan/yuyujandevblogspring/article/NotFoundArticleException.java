package dev.yuyujan.yuyujandevblogspring.article;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(org.springframework.http.HttpStatus.NOT_FOUND)
public class NotFoundArticleException extends RuntimeException {
    public NotFoundArticleException(Long id) {
        super("Article not found with id: " + id);
    }
}
