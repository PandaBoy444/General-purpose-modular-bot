/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pandev.modularbot;

import net.dv8tion.jda.core.JDA;
import org.eclipse.egit.github.core.IRepositoryIdProvider;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.IssueService;

/**
 *
 * @author PandaBoy444
 */
public class GLOBAL {
    public static GitHubClient gitHubClient;
    public static JDA discordClient;
    public static IssueService githubIssueService;
    public static IRepositoryIdProvider githubRepo;
    public static boolean isDebug = false;
}
