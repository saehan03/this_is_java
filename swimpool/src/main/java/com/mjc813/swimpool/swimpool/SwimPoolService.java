package com.mjc813.swimpool.swimpool;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class SwimPoolService {
    //	@Autowired
    private final SwimPoolRepository swimpoolRepository;

    public SwimPoolDto insert(SwimPoolDto insertDto) {
        log.debug("insetDto = {}", insertDto);
        SwimPoolEntity newObject = (SwimPoolEntity) new SwimPoolEntity().copy(insertDto, true);
        SwimPoolEntity madeObject = this.swimpoolRepository.save(newObject);
        this.swimpoolRepository.flush();
        SwimPoolDto result = (SwimPoolDto) new SwimPoolDto().copy(madeObject, true);
        log.debug("result = {}", result);
        return result;
    }

    public SwimPoolDto findById(Long id) {
        log.debug("findById = {}", id);
        SwimPoolEntity find = this.swimpoolRepository.findById(id).orElseThrow();
        SwimPoolDto result = (SwimPoolDto) new SwimPoolDto().copy(find, true);
        log.debug("result = {}", result);
        return result;
    }

    public SwimPoolDto update(SwimPoolDto updateDto) {
        log.debug("update = {}", updateDto);
        SwimPoolDto find = this.findById(updateDto.getId());
        find.copy(updateDto, false);
        SwimPoolEntity updateEntity = (SwimPoolEntity) new SwimPoolEntity().copy(find, true);
        SwimPoolEntity save = this.swimpoolRepository.save(updateEntity);
        SwimPoolDto result = (SwimPoolDto) new SwimPoolDto().copy(save, true);
        log.debug("result = {}", result);
        return result;
    }

    public SwimPoolDto deleteById(Long id) {
        log.debug("delete = {}", id);
        SwimPoolDto find = this.findById(id);
        this.swimpoolRepository.deleteById(id);
        log.debug("result = {}", find);
        return find;
    }

    public List<SwimPoolDto> findAll() {
        List<SwimPoolEntity> list = this.swimpoolRepository.findAll();
        List<SwimPoolDto> result = list.stream().map(
                node -> (SwimPoolDto) new SwimPoolDto().copy(node, true)
        ).toList();
        return result;
    }
}
