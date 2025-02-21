import ky from 'ky';
import { actionTypes } from 'shared/api/auth/store';

export const login = (email, password) => async (dispatch) => {
    try {
      const response = await ky.post('/users/login', {
        json: { user: { email, password } },
      }).json();
      
      dispatch({
        type: actionTypes.SET_USER,
        payload: response.data.user,
      });
    } catch (error) {
      dispatch({
        type: actionTypes.SET_ERROR,
        payload: error.message,
      });
    }
  };