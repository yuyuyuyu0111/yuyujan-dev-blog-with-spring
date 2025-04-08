package dev.yuyujan.yuyujandevblogspring.article;

import dev.yuyujan.yuyujandevblogspring.tag.Tag;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

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
    @OneToMany
    @JoinColumn(name = "tag_id")
    private List<Tag> tags;
}
