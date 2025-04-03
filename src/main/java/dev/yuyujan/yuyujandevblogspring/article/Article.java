package dev.yuyujan.yuyujandevblogspring.article;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long articleId;
    private String enTitle;
    private String jpTitle;
    private Timestamp insertTime;
    private Timestamp updateTime;
    private String content;
    private Long tagId;
}
