const MemberBox= ({name,gender,music})=>{
    return(
        <div>
            <p>이름 : {name}</p>
            <p>성별 : {gender}</p>
            <p>좋아하는 노래 : {music}</p>
        </div>
    )
}

export default MemberBox