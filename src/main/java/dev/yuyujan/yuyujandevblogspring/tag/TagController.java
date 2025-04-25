package dev.yuyujan.yuyujandevblogspring.tag;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tag")
public class TagController {
    private final TagRepository tagRepository;

    TagController(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    @GetMapping("")
    public String tags(Model model) {
        var tags = tagRepository.findAll();
        model.addAttribute("tags", tags);
        return "tag/list";
    }

    @GetMapping("/search/{tagName}")
    public String tag(@PathVariable String tagName, Model model) {
        var tags = tagRepository.findByTagName(tagName);
        model.addAttribute("tags", tags);
        return "tag/search";
    }

}
