package ru.ncedu.implement;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.ncedu.entity.*;
import ru.ncedu.model.DataAuto;
import ru.ncedu.interfaces.CompareAutoRepository;
import ru.ncedu.services.*;

@Slf4j
@Service
@RequiredArgsConstructor
public class CreateListCompareAutoServiceImp implements CreateListCompareAutoService {

    private final CompareAutoRepository compareAutoRepository;

    @Override
    public CompareAuto addAutoToListCompare(DataAuto dataAuto, Long idUser) {
        CompareAuto compareAuto = compareAutoRepository.findByIdUserAndIdAuto(idUser, dataAuto.getId());
        return (compareAuto != null) ? compareAuto : compareAutoRepository.save(new CompareAuto(null, dataAuto.getId(), idUser));
    }
}
