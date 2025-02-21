import ky from 'ky';

export const register = async () => {
    try {
        const response = await ky.get('https://www.fictory.com/api/register').json();
        console.log(response);
    } catch (error) {
        console.error('Request failed', error);
    }
};