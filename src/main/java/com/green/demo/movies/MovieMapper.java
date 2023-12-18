package com.green.demo.movies;

import com.green.demo.movies.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MovieMapper {
    // 일정 추가
    int postMedia(InsDto dto);
    // 일정 추가 : 사진 추가
    int postMediaPics(InsDto dto);
    //일정 수정
    int upMedia(UpDto dto);
    //일정 수정 : 사진 삭제
    int delUpMiePics(UpDto dto);
    // 일정 삭제 : 일정 삭제
    int delMedia(DelMideaDto dto);
    // 일정 삭제 : 사진삭제
    int delMediaPic(int imedia);
    //메인페이지 출력
    List<GetMediaAllVo> getMediaAll(GetMediaAllDto dto);
    // 날짜별 media 리스트select하기
    List<GetDayMediaVo>getDayMedia(GetDayMediaDto dto);
    // media 리스트(볼것/본것)
    List<GetMediaVo> getMedia(GetMediaDto dto);
    // media 상세 페이지
    GetDetailMediaVo getDetailMedia(GetDetailMediaDto dto);
    List<String> getDetailMediaPics(GetDetailMediaDto dto);

}
