package com.spring.codeblog.service.serviceImpl;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;
import com.spring.codeblog.service.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeblogServiceImpl implements CodeblogService {

    @Autowired
    CodeblogRepository codeblogrepository;
    @Override
    public List<Post> findAll() {
        return codeblogrepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return codeblogrepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return codeblogrepository.save(post);
    }
}
