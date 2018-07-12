package com.javarush.task.task23.task2309;

import com.javarush.task.task23.task2309.vo.*;

import java.util.List;

/* 
Анонимность иногда так приятна!
*/
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        print(solution.getUsers());
        print(solution.getLocations());
    }
    public List<User> getUsers() {
        return new AbstractDbSelectExecutor<User>(){

            @Override
            public String getQuery() {
                return String.format("SELECT * FROM %s", User.class.getSimpleName().toUpperCase());
            }
        }.execute();
    }
    public List<Location> getLocations() {
        return new AbstractDbSelectExecutor<Location>() {
            @Override
            public String getQuery() {
                return String.format("SELECT * FROM %s", Location.class.getSimpleName().toUpperCase());
            }
        }.execute();
    }

    public List<Server> getServers() {
        return new AbstractDbSelectExecutor<Server>() {
            @Override
            public String getQuery() {
                return String.format("SELECT * FROM %s", Server.class.getSimpleName().toUpperCase());
            }
        }.execute();
    }

    public List<Subject> getSubjects() {
        return new AbstractDbSelectExecutor<Subject>() {
            @Override
            public String getQuery() {
                return String.format("SELECT * FROM %s", Subject.class.getSimpleName().toUpperCase());
            }
        }.execute();
    }

    public List<Subscription> getSubscriptions() {
        return new AbstractDbSelectExecutor<Subscription>() {
            @Override
            public String getQuery() {
                return String.format("SELECT * FROM %s", Subscription.class.getSimpleName().toUpperCase());
            }
        }.execute();
    }


    public static void print(List list) {
        String format = "Id=%d, name='%s', description=%s";
        for (Object obj : list) {
            NamedItem item = (NamedItem) obj;
            System.out.println(String.format(format, item.getId(), item.getName(), item.getDescription()));
        }
    }
}
