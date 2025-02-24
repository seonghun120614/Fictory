import React from 'react'
import LoginInput from 'shared/ui/loginInput'

export function LoginPage() {
    return (
        <div className='items-center flex justify-center'>
            <div className=''>
                <h3>로그인</h3>
                <form>
                    <LoginInput 
                    label="사용자 이름"
                    name="id"
                    type="text"
                    placeholder="아이디를 입력해 주세요"
                    value=""
                    onChange=""
                />
                <LoginInput 
                    label="비밀번호"
                    name="password"
                    type="password"
                    placeholder="비밀번호를 입력해 주세요"
                    value=""
                    onChange=""
                />
                <a href=''>아이디 및 비밀번호 찾기</a>
                <span>없는 사용자 입니다.</span>
                <button>로그인</button>
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