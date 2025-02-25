import React, { useEffect, useState } from 'react'
import { LoginInput, MemberButton } from 'shared';

export function SingupPage() {
    const [loginForm, setLoginForm] = useState({
        id: '',
        password: '',
        ckpassword:'',
    });
    const [showcheck,setShowCheck] = useState(false);
    const [showid, setShowId] = useState(false);
    const [showps,setShowPs] = useState(false);

    const idReg = /^[a-zA-Z0-9_]{4,24}$/;
    const passwordReg = /^[a-zA-Z0-9_]{8,24}$/;

    const handleInput = (e) =>{
        const { name, value } = e.target;
        setLoginForm(prev => ({
            ...prev,
            [name]: value
        }));
    }

    useEffect(() =>{
        if(loginForm.password != loginForm.ckpassword){
            setShowCheck(true)
        }else{
            setShowCheck(false)
        }
        if(!idReg.test(loginForm.id)){
            setShowId(true)
        }else{
            setShowId(false)
        }
        if(!passwordReg.test(loginForm.password)){
            setShowPs(true)
        }else{
            setShowPs(false)
        }
    })


    return (
        <div className="items-center flex justify-center h-full">
            <div className="bg-white p-[20px] rounded-lg  border-solid border-1">
                <from>
                    <LoginInput 
                        label="사용자 이름"
                        name="id"
                        type="text"
                        placeholder="사용자 이름 입력"
                        value={loginForm.id}
                        onChange={handleInput}
                        show={showid}
                        validatortext="4-24자 영어,숫자,_ 입력 가능"
                    />
                    <LoginInput 
                        label="비밀번호"
                        name="password"
                        type="password"
                        placeholder="비밀번호를 입력해 주세요"
                        value={loginForm.password}
                        onChange={handleInput}
                        show={showps}
                        validatortext="특수 문자 미포함"
                    />
                    <LoginInput 
                        label="비밀번호 확인"
                        name="ckpassword"
                        type="password"
                        placeholder="비밀번호를 입력해 주세요"
                        value={loginForm.ckpassword}
                        onChange={handleInput}
                        show={showcheck}
                        validatortext="불일치"
                    />
                    <div className="float-right">
                        <button>취소</button>
                        <MemberButton btext="확인"/>
                    </div>
                </from>
            </div>
        </div>
    )
}