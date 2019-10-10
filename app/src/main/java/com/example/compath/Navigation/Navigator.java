package com.example.compath.Navigation;

import com.example.compath.Data.Spot;
import com.example.compath.Data.Tour;

public class Navigator {

    private Tour tour;
    private String userName; //or id
    private String startDate; //yyyy.mm.dd 형태로 저장할 예정
    private int[] selection; //Tour에서 사용자가 선택한 옵션의 번호 배열
    private Spot startSpot, endSpot;

    public Navigator(Tour tour, String userName) {
        this.tour = tour;
        this.userName = userName;

        initiateSelection();

    }

    private void initiateSelection() {                    //객체 생성시 초기 Selection 세팅. 선택불가능한 옵션은 0, 나머지는 비워둠
        selection = new int[tour.getSizeOfPlan()];
        for (int i = 0; i < selection.length; i++) {
            if (tour.getPlan().get(i).size() == 1) {
                selection[i] = 0;
            }
        }

    }

    public void setSelection(int index, int choice) {      //옵션 선택
        selection[index] = choice;
    }

    public void setDate(String year, String month, String day) {        //여행 날짜 선택하는 메소드
        startDate = year + "." + month + "." + day;
    }

    public void setSpot(String key) {           //google Places 이용해서 구현해야 함.
        if (key.equals("start")) {

        } else {

        }
    }

    public boolean isSettingCompleted() {        //사전 준비가 끝났는지 확인
        if (startDate.isEmpty()) {
            return false;
        }

        if (startSpot == null || endSpot == null) {
            return false;
        }

        return true;
    }

}
