package com.green.demo.movies;

import com.green.demo.movies.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/media")
public class MovieControlle {
    private final MovieService service;
    //일정 추가
    @PostMapping
    public int postMedia(@RequestBody InsDto dto){
        return service.postMedia(dto);
    }
    //일정 수정
    @PutMapping
    public int putMedia(@RequestBody UpDto dto){
        return service.putMedia(dto);
    }
    // 일정 삭제
    @PutMapping("/del")
    public int delMedia(DelMideaDto dto){
        return service.delMedia(dto);
    }
    //메인페이지 출력
    @GetMapping("/ym")
    List<GetMediaAllVo> getMediaAll( GetMediaAllDto dto){
        return service.getMediaAll(dto);
    }
    // 날짜별 media 리스트select하기
    @GetMapping("/day0")
    public List<GetDayMediaVo> getDayMedia( GetDayMediaDto dto){
        return service.getDayMedia(dto);
    }
    // media 리스트(볼것/본것)
    @GetMapping
    public List<GetMediaVo> getMedia(GetMediaDto dto){
        return service.getMedia(dto);
    }
    // media 상세 페이지
    @GetMapping("/{imedia}")
    public GetDetailMediaVo getDetailMedia(@PathVariable int imedia, int iuser){
        GetDetailMediaDto dto = new GetDetailMediaDto();
        dto.setImedia(imedia);
        dto.setIuser(iuser);
        return service.getDetailMedia(dto);
    }
}
