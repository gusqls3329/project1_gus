package com.green.demo.movies;

import com.green.demo.movies.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieMapper mapper;
    // 일정 추가
    public int postMedia(InsDto dto){
             mapper.postMedia(dto);
             mapper.postMediaPics(dto);
             return dto.getImedia();
    }
    // 일정 수정
    public int putMedia(UpDto dto){
        int result = mapper.upMedia(dto);
        mapper.delUpMiePics(dto);

        InsDto insDto = new InsDto();
        insDto.setImedia(dto.getImedia());
        insDto.setPics(dto.getPics());

        mapper.postMediaPics(insDto);
        return result;
    }
    public int delMedia(DelMideaDto dto){
        // 일정 삭제 : 삭제 전 글쓴사람이 맞는지 확인
       Integer result =  mapper.delMedia(dto);
           return result;

    }
    //메인페이지 출력
    List<GetMediaAllVo> getMediaAll(GetMediaAllDto dto){
        return mapper.getMediaAll(dto);
    }
    // 날짜별 media 리스트select하기
    public List<GetDayMediaVo> getDayMedia(GetDayMediaDto dto){
       return mapper.getDayMedia(dto);
    }
    // media 리스트(볼것/본것)
    public List<GetMediaVo> getMedia(GetMediaDto dto){
        return mapper.getMedia(dto);
    }
    // media 상세 페이지
    public GetDetailMediaVo getDetailMedia(GetDetailMediaDto dto){
        GetDetailMediaVo vo = mapper.getDetailMedia(dto);
        List<String> pics = mapper.getDetailMediaPics(dto);
        vo.setPic(pics);
         return vo;
    }
}
