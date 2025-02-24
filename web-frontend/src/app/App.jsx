import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Route, Routes } from 'react-router-dom';
import { LoginPage } from 'pages/member/ui/LoginPage';

export function App () {
    return (
            <Routes>
                <Route path='/' element={<LoginPage />} />
            </Routes>
    )
}