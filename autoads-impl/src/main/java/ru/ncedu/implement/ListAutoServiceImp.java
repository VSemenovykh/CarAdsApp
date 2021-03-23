package  ru.ncedu.implement;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ncedu.entity.Auto;
import ru.ncedu.entity.Brand;
import ru.ncedu.entity.Motor;
import ru.ncedu.model.AutoJoin;
import ru.ncedu.repository.AutoRepository;
import ru.ncedu.service.BrandService;
import ru.ncedu.service.ListAutoService;
import ru.ncedu.service.MotorService;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ListAutoServiceImp implements ListAutoService {

    private final AutoRepository autorepository;

    private final BrandService brandService;

    private final MotorService motorService;

    @Override
    public List<AutoJoin> getListAuto() {
        List<Auto> autoList = autorepository.findAll();
        List<AutoJoin> listAutoJoin = new ArrayList<>();

        String brandName;
        String modelName;
        String year;

        String motorType;
        double volume;

        for (Auto auto : autoList) {
            Brand brand = brandService.findById(auto.getIdBrand());
            Motor motor = motorService.findById(auto.getIdMotor());

            brandName = brand.getNameBrand();
            modelName = brand.getNameModel();
            year = brand.getYear();

            motorType = motor.getMotorType();
            volume = motor.getVolume();

            AutoJoin autoJoin = new AutoJoin( auto.getId()
                                             ,brandName
                                             ,modelName
                                             ,year
                                             ,auto.getColor()
                                             ,auto.getPrice()
                                             ,motorType
                                             ,volume
                                             ,auto.getDriveType()
                                             ,auto.getTransmissionType()
                                             ,auto.getBodyStyleType());

            listAutoJoin.add(autoJoin);
        }

        return listAutoJoin;
    }
}
