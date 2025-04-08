package dev.yuyujan.yuyujandevblogspring.tag;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tag_id")
    private Long tagId;
    private String tagName;
}
