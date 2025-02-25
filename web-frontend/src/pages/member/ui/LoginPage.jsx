import React, { useState } from 'react'
import { LoginInput, MemberButton } from 'shared';

export function LoginPage() {
    const [id,setId] = useState('');
    const [password,setPassword] = useState('');


    return (
        <div className='items-center flex justify-center h-full'>
            <div className='bg-white p-[20px] rounded-lg  border-solid border-1'>
                <h4>로그인</h4>
                <form>
                    <LoginInput 
                    label="사용자 이름"
                    name="id"
                    type="text"
                    placeholder="아이디를 입력해 주세요"
                    value={id}
                    onChange=""
                />
                <LoginInput 
                    label="비밀번호"
                    name="password"
                    type="password"
                    placeholder="비밀번호를 입력해 주세요"
                    value={password}
                    onChange=""
                />
                <div className="float-right">
                    <a className="text-[10px] no-underline text-gray-400" href='https://naver.com'>아이디 및 비밀번호 찾기</a>
                    {/* <span>없는 사용자 입니다.</span> */}
                    <MemberButton btext="로그인"/>
                </div>
                </form>
            </div>
        </div>
    )
}

// <LoginInput
//               label = "비밀번호"
//               name = "password"
//               type = "password"
//               placeholder = "비밀번호를 입력해주세요"
//               value = {loginForm.password}
//               onChange = {handleInputChange}
// />