// 버튼은 색깔도 유동적으로 만들 수 있음, ex. 취소, 확인 버튼이 명확히 나뉘어짐
// Input: name(버튼 이름), variant(버튼 색깔), func(누르면 실행), img(optional 있으면 먼저 띄워지고 그 밑에 이름), onChange

export const MemberButton = ( btext ) =>{
    <button className="h-[25px] bg-black text-white rounded-lg w-[60px] text-[12px] ml-[5px]">{btext}</button>
}
