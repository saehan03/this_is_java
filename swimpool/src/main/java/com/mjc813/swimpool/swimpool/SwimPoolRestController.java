package com.mjc813.swimpool.swimpool;

import com.mjc813.swimpool.common.CommonResponseCode;
import com.mjc813.swimpool.common.CommonResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/sp")
public class SwimPoolRestController {
    @Autowired
    private SwimPoolService swimpoolService;

    @PostMapping
    public ResponseEntity<CommonResponseDto<SwimPoolDto>> insert(@RequestBody SwimPoolDto insertDto) {
        SwimPoolDto result = this.swimpoolService.insert(insertDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(
                CommonResponseDto.make(CommonResponseCode.C0000, result)
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<CommonResponseDto<SwimPoolDto>> findById(@PathVariable Long id) {
        SwimPoolDto result = this.swimpoolService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(
                CommonResponseDto.make(CommonResponseCode.C0000, result)
        );
    }

    @PatchMapping
    public ResponseEntity<CommonResponseDto<SwimPoolDto>> update(@RequestBody SwimPoolDto updateDto) {
        SwimPoolDto result = this.swimpoolService.update(updateDto);
        return ResponseEntity.status(HttpStatus.OK).body(
                CommonResponseDto.make(CommonResponseCode.C0000, result)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CommonResponseDto<SwimPoolDto>> delete(@PathVariable Long id) {
        SwimPoolDto result = this.swimpoolService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body(
                CommonResponseDto.make(CommonResponseCode.C0000, result)
        );
    }

    @GetMapping("/all")
    public ResponseEntity<CommonResponseDto<List<SwimPoolDto>>> findAll() {
        List<SwimPoolDto> result = this.swimpoolService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(
                CommonResponseDto.make(CommonResponseCode.C0000, result)
        );
    }
}