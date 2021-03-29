package ru.ncedu.implement;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ncedu.entity.Brand;
import ru.ncedu.repository.BrandRepository;
import ru.ncedu.service.BrandService;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BrandServiceImp implements BrandService {

    private final BrandRepository brandRepository;

    @Override
    public List<Brand> findAll() {
        List<Brand> brand = new ArrayList<>();
        brandRepository.findAll().forEach(brand::add);
        return brand;
    }

    @Override
    public Brand findById(Long id) {
        Brand brand = brandRepository.findById(id).orElse(null);
        return brand;
    }
}