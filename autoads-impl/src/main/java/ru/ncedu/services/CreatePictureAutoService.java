package ru.ncedu.services;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface CreatePictureAutoService {

    Long createPictureAuto(MultipartFile file) throws IOException;
}
