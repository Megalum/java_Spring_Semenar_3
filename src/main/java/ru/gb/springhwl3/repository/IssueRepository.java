package ru.gb.springhwl3.repository;

import org.springframework.stereotype.Repository;
import ru.gb.springhwl3.entity.Issue;
import ru.gb.springhwl3.entity.Reader;

import java.util.ArrayList;
import java.util.List;

@Repository
public class IssueRepository {
    private List<Issue> list = new ArrayList<>();

    public void createIssue(Issue issue){
        list.add(issue);
    }

    public Issue searchReader(long id){
        return list.stream().filter(e -> e.getIdReader() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Issue> searchAllReader(long id){
        return list.stream().filter(e -> e.getIdReader() == id)
                .toList();
    }

    public Issue findById(long id){
        return list.stream().filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
