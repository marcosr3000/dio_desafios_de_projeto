import styled from "styled-components";

export const Wrapper = styled.div`
    display: flex;
    width: 100%;
    justify-content: space-between;
    padding: 4px;

    input {
        border: 1px solid #ccc;
        border-radius: 8px;
        width: 100%;
        height: 44px;
        padding: 8px;
        font-weight: 400;
    }

    button {
        background-color: #2F1B5A;
        padding: 8px 16px;
        margin: 0 8px 0 8px;
        border-radius: 8px;
        font-weight: bold;
        font-size: 16px;
        color: yellow;

        &:hover {
            background-color: yellow;
            box-shadow: 3px 2px 10px rgba(0,0,0,0.2);
            color: #2F1B5A;
            border: 1px solid #2F1B5A;
        }

        span {
            font-weight: bold;
        }
    }
`;