var gerenciadorPessoaModule = angular.module("gerenciadorPessoaModule", []);

gerenciadorPessoaModule.controller("gerenciadorPessoaController", function($scope, $http) {

	$scope.gerenciadorPessoaModel = {};
	
	$scope.gerenciadorPessoaModelList = [];
	
	$scope.isApresentaMensagemSucesso = false;
	
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
    	$scope.remove_(gerenciadorPessoaModelSelecionado);
    	if(gerenciadorPessoaModelSelecionado.codigo == undefined || gerenciadorPessoaModelSelecionado.codigo == null) {
   			gerenciadorPessoaModelSelecionado.codigo = gerenciadorPessoaModelSelecionado.codigo == null ? null : gerenciadorPessoaModelSelecionado.codigo;
   			$http.post(URL_PESSOA_SERVICE, gerenciadorPessoaModelSelecionado);
   			$scope.gerenciadorPessoaModelList.push(gerenciadorPessoaModelSelecionado);
   		} else {
   			$http.put(URL_PESSOA_SERVICE, gerenciadorPessoaModelSelecionado);
   			$scope.gerenciadorPessoaModelList.push(gerenciadorPessoaModelSelecionado);
   		}
  		console.log("SUCESSO: Dados cadastrados com Sucesso!");
  		$scope.isApresentaMensagemSucesso = true;
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
    $scope.remove_ = function(gerenciadorPessoaModelSelecionado) {
    	for( var indiceX = 0 ; indiceX < $scope.gerenciadorPessoaModelList.length ; indiceX++ ) {
    		if($scope.gerenciadorPessoaModelList[indiceX].codigo == gerenciadorPessoaModelSelecionado.codigo) {
    			$scope.gerenciadorPessoaModelList.splice(indiceX, 1);
    		}
    	}
    };
    
    /**
     * Funcionalidade:	Responsavel por remover os dados de Gerenciador de Pessoa
     * */
    $scope.remove = function(gerenciadorPessoaModelSelecionado) {
//    	recuperarRegistroCadastrado(gerenciadorPessoaModelSelecionado);
    	for( var indiceX = 0 ; indiceX < $scope.gerenciadorPessoaModelList.length ; indiceX++ ) {
    		if($scope.gerenciadorPessoaModelList[indiceX].codigo == gerenciadorPessoaModelSelecionado.codigo) {
    			$http.delete(URL_PESSOA_SERVICE + '/' + gerenciadorPessoaModelSelecionado.codigo);
    			$scope.gerenciadorPessoaModelList.splice(indiceX, 1);
    		}
    	}
    	$scope.clear();
    };
    
    /**
     * Funcionalidade:	Responsavel por limpar formulario
     */
    function gerenciadorPessoaConfiguration(gerenciadorPessoaModelSelecionado) {
    	$scope.gerenciadorPessoaModel = [{
    		codigo: gerenciadorPessoaModelSelecionado.codigo == undefined ? null : gerenciadorPessoaModelSelecionado.codigo,
    		isAtivo: true,
    		isFontePagamento: gerenciadorPessoaModelSelecionado.isFontePagamento != undefined ? gerenciadorPessoaModelSelecionado.isFontePagamento : null,
    		nome: gerenciadorPessoaModelSelecionado.nome != undefined ? gerenciadorPessoaModelSelecionado.nome : null,
    		observacao: null,
    		tipoPessoaEnumeration: gerenciadorPessoaModelSelecionado.tipoPessoaEnumeration != undefined ? gerenciadorPessoaModelSelecionado.tipoPessoaEnumeration : null,
    	}];
    	return $scope.gerenciadorPessoaModel;
    };
    
    /**
     * Funcionalidade:	Responsavel por limpar formulario
     */
    $scope.clear = function() {
    	$scope.gerenciadorPessoaModel = [];
    };
    
});