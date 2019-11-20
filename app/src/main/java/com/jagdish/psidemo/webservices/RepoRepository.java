package com.jagdish.psidemo.webservices;

import com.jagdish.psidemo.data.PsiResponse;

import javax.inject.Inject;

import io.reactivex.Single;

public class RepoRepository {

    private final RepoService repoService;

    @Inject
    public RepoRepository(RepoService repoService) {
        this.repoService = repoService;
    }

    public Single<PsiResponse> getPSIData(String datetime, String date) {
        return repoService.getPSIData(datetime, date);
    }
}
