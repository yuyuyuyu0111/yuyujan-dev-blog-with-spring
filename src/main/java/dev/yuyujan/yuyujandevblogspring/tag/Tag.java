package dev.yuyujan.yuyujandevblogspring.tag;

import dev.yuyujan.yuyujandevblogspring.articletag.ArticleTag;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tag_id")
    private Long tagId;
    private String tagName;
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime insertTime;
    @UpdateTimestamp
    private LocalDateTime updateTime;
    @OneToMany(mappedBy = "tag")
    private Set<ArticleTag> articleTags;
}
