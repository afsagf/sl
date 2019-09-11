package com.sy.service.ggy;

import com.sy.mapper.ggy.Info_annexesMapper;
import com.sy.model.Info_annexes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GInfo_annexesServiceImpl implements GInfo_annexesService {
    @Autowired
    Info_annexesMapper infoAnnexesMapper;
    @Override
    public List<Info_annexes> findAll() {
        return infoAnnexesMapper.selectAll();
    }
}
