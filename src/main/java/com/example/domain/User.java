package com.example.domain;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Size;

/**
 * A data class to represent a user.
 * 
 * @author Siebe Joris Jochems
 * 
 */
public class User
{
    @Size(min = 2)
    private String username;
    private List<Post> posts = new ArrayList<Post>();

    /**
     * @return The username of this user.
     */
    public String getUsername()
    {
        return username;
    }

    /**
     * Set the username of this user. Must be minimal 2 characters.
     * 
     * @param username The username to set.
     */
    public void setUsername(String username)
    {
        this.username = username;
    }

    /**
     * @return The {@link Post}s this user has posted.
     */
    public List<Post> getPosts()
    {
        return posts;
    }
}
