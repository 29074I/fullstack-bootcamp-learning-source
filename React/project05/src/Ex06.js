import React from 'react'
import { useRef } from 'react'

const Ex06 = () => {

    
    
    let pdfStyle = {
        width : '100%',
        height : '90%'
    }
    
    const pdfRef = useRef()
    
    let pdf1 = `http://localhost:3000/pdf/pdf1.pdf`
    let pdf2 = `http://localhost:3000/pdf/pdf2.pdf`

    const changePdf = () =>{
        if(pdfRef.current.src == pdf1){
            pdfRef.current.src = pdf2
        }else{
            pdfRef.current.src = pdf1
        }
    }


    return (
        <div  style={{ height : '100vh' }}>
            <h3>오늘의 학습자료{' '}
                <button onClick={changePdf}>변경</button>
            </h3>
            <iframe ref={pdfRef} style={pdfStyle} src={'/pdf/pdf1.pdf'}></iframe>
        </div>
    )
}

export default Ex06