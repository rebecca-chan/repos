package com.example.repos.data

import retrofit2.http.GET
import retrofit2.http.Query

interface GithubRepoApi {

    @GET("/search/repositories?sort=stars&per_page=3")
    suspend fun getTopThreeRepos(
        @Query("q") query: String,
    ): RepoSearchResponse
}