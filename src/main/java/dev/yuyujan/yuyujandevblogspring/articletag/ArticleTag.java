package dev.yuyujan.yuyujandevblogspring.articletag;

import dev.yuyujan.yuyujandevblogspring.article.Article;
import dev.yuyujan.yuyujandevblogspring.tag.Tag;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "article_tag")
public class ArticleTag {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "article_tag_seq")
    @SequenceGenerator(allocationSize = 1, name = "article_tag_seq", sequenceName = "article_tag_seq")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    @ManyToOne
    @JoinColumn(name = "tag_id")
    private Tag tag;
}