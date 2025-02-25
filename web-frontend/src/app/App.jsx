import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Route, Routes } from 'react-router-dom';
import { LoginPage, SingupPage } from 'pages/member/index';

export function App () {
    return (
            <Routes>
                <Route path='/' element={<LoginPage />} />
                <Route path='/singup' element={<SingupPage />} />
            </Routes>
    )
}