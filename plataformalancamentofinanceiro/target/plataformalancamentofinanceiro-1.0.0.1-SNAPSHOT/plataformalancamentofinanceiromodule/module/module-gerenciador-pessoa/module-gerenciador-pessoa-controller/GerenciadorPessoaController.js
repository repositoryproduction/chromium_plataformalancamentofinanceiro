var gerenciadorPessoaModule = angular.module("gerenciadorPessoaModule", []);

gerenciadorPessoaModule.controller("gerenciadorPessoaController", function($scope, $http) {

	$scope.gerenciadorPessoaModel = {};
	
	$scope.gerenciadorPessoaModelList = [];
	
	/**
     * Funcionalidade: Responsavel por recuperar os dados do cadastro de pessoas
	 * URL do Servico de Gerenciador de Pessoa
     */
    URL_PESSOA_SERVICE = 'http://localhost:18080/plataformalancamentofinanceiro-1.0.0.1-SNAPSHOT/plataformalancamentofinanceiro/gerenciadorPessoaResource';
	
    /**
     * Funcionalidade: Responsavel por recuperar os dados do 'Gerenciador de Pessoa'
     */
    $http.get(URL_PESSOA_SERVICE).then(function(response) {
        $scope.gerenciadorPessoaModelList = response.data;
    });
    
    /**
     * Funcionalidade:	Responsavel por Salvar os dados de Gerenciador de Pessoa
     * */
    $scope.persist = function(gerenciadorPessoaModelSelecionado) {
    	$scope.remove(gerenciadorPessoaModelSelecionado);
   		if(gerenciadorPessoaModelSelecionado.codigo == undefined) {
   			$http.post(URL_PESSOA_SERVICE, gerenciadorPessoaModelSelecionado);
   			$scope.gerenciadorPessoaModelList.push(gerarCodigoPessoaModel(gerenciadorPessoaModelSelecionado));
   		} else {
   			$http.put(URL_PESSOA_SERVICE, gerenciadorPessoaModelSelecionado);
   			$scope.gerenciadorPessoaModelList.push(gerenciadorPessoaModelSelecionado);
   		}
  		console.log("SUCESSO: Dados cadastrados com Sucesso!");
       	$scope.clear();
    };
    
    /**
     * Funcionalidade: 	Responsavel por Editar os dados de Gerenciador de Pessoa
     * Acao:           	Carrega o objeto da 'view' para o 'controller'
     * */
    $scope.merge = function(gerenciadorPessoaModelSelecionado) {
    	$scope.gerenciadorPessoaModel = angular.copy(gerenciadorPessoaModelSelecionado);
    };
    
    /**
     * Funcionalidade:	Responsavel por remover os dados de Gerenciador de Pessoa
     * */
    $scope.remove = function(gerenciadorPessoaModelSelecionado) {
//    	recuperarRegistroCadastrado(gerenciadorPessoaModelSelecionado);
    	for( var indiceX = 0 ; indiceX < $scope.gerenciadorPessoaModelList.length ; indiceX++ ) {
    		if($scope.gerenciadorPessoaModelList[indiceX].codigo == gerenciadorPessoaModelSelecionado.codigo) {
    			$scope.gerenciadorPessoaModelList.splice(indiceX, 1);
    		}
    	}
    };
    
    /**
     * Funcionalidade:	Responsavel por limpar formulario
     */
    $scope.clear = function() {
    	$scope.gerenciadorPessoaModel = [];
    };
    
});