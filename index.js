function criaCalculadora(){
    
    
    
    return{
        display: document.querySelector('.display'),
        bt_limpar: document.querySelector('.btn_clear'),
        bt_deleta: document.querySelector('.btn_deletar'),

        displayClear(){
            this.display.value = '';
        },
        apagaUm(){
            this.display.value = this.display.value.slice(0, -1);
        },

         inicia(){
            this.botoesClicks();
            this.pressionaEnter();
            this.pressionaESC();
            this.foncando();
        },
        foncando(){
            document.querySelector(".display").focus();
        },

        pressionaEnter(){
            this.foncando();
            this.display.addEventListener('keyup', function(e){
                if(e.keyCode === 13){                    
                    this.calcular();
                }
            }.bind(this));
        },

        pressionaESC(){
            this.display.addEventListener('keyup', function(e){
                if(e.keyCode === 27){
                    this.foncando();
                    this.displayClear();
                }
            }.bind(this));
        },


        calcular(){
            let conta = this.display.value;
            try {
            conta = eval(conta);
            if(!conta){
                alert("Conta invalida");
                return;
            }
            this.display.value = String(conta);
            }catch(e){
                alert("Erro");
                return;
            }
        },

        botoesClicks(){
            document.addEventListener('click', function(e){
                const el = e.target;
                if(el.classList.contains('btn_num')){
                    this.btnParaDisplay(el.innerText);
                }
                if(el.classList.contains('btn_clear')){
                   this.displayClear(); 
                }
                if(el.classList.contains('btn_deletar')){
                    this.apagaUm();
                }
                if(el.classList.contains('btn_igual')){
                    this.calcular();
                }

            }.bind(this));
        },
        
        btnParaDisplay(valor){
            this.display.value += valor;
            console.log(valor);
        }
    }

}

const calculadora = criaCalculadora();
calculadora.inicia();