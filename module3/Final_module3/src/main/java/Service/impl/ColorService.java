package Service.impl;

import Model.Color;
import Repository.impl.ColorRepository;
import Service.IColorService;

import java.util.List;

public class ColorService implements IColorService {
    ColorRepository colorRepository = new ColorRepository();
    @Override
    public List<Color> findAll() {
        return colorRepository.findAll();
    }
}
