package dev.yuyujan.yuyujandevblogspring.article;

import dev.yuyujan.yuyujandevblogspring.articletag.ArticleTag;
import dev.yuyujan.yuyujandevblogspring.tag.Tag;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "article_seq")
    @SequenceGenerator(allocationSize = 1, name = "article_seq", sequenceName = "article_seq")
    private Long articleId;
    private String enTitle;
    private String jpTitle;
    private LocalDateTime insertTime;
    private LocalDateTime updateTime;
    private String content;
    @OneToMany(mappedBy = "article")
    private Set<ArticleTag> articleTags;

}
